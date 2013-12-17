package org.landa.wiidget.library.html.datatable;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.annotation.ContextVariable;
import org.landa.wiidget.library.html.TemplatedHtmlWiidget;
import org.landa.wiidget.validator.Required;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class LinkPaginator extends TemplatedHtmlWiidget implements Paginator {

	@Required
	@DefaultField
	private PageableDataTable dataTable;

	@ContextVariable
	private String cssClass = "pagination";

	@Required
	@ContextVariable
	private String pageVar = "page";

	@ContextVariable
	private String listCssClass = "paginator-list";

	@ContextVariable
	private final String itemCssClass = "item";

	@ContextVariable
	private String prevPageLabel = "&laquo;";

	@ContextVariable
	private String nextPageLabel = "&raquo;";

	@Required
	@ContextVariable
	private int itemsPerPage = 5;

	public PageableDataTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(final PageableDataTable dataTable) {
		this.dataTable = dataTable;
	}

	@Override
	@ContextVariable(name = "currentPage")
	public int getCurrentPage() {
		final String clientPageVar = getClientPageVar();

		final Object pageObj = getWiidgetFactory().getWiidgetContext().get(
				clientPageVar);
		if (null == pageObj) {
			return 1;
		} else {

			return Integer.parseInt(pageObj.toString());
		}
	}

	@Override
	@ContextVariable(name = "pageCount")
	public int getPageCount() {
		final int listSize = getDataTable().getDataSize();

		return (int) Math.ceil(listSize / getItemsPerPage());
	}

	public void setPageVar(final String pageVar) {
		this.pageVar = pageVar;
	}

	@ContextVariable(name = "clientPageVar")
	public String getClientPageVar() {
		final String tableId = getDataTable().getId();
		return tableId + "." + getPageVar();
	}

	public String getPageVar() {
		return pageVar;
	}

	@Override
	public int getItemsPerPage() {
		return itemsPerPage;
	}

	public void setItemsPerPage(final int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public String getListCssClass() {
		return listCssClass;
	}

	public void setListCssClass(final String listCssClass) {
		this.listCssClass = listCssClass;
	}

	/**
	 * @return the itemCssClass
	 */
	public String getItemCssClass() {
		return itemCssClass;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(final String cssClass) {
		this.cssClass = cssClass;
	}

	public String getPrevPageLabel() {
		return prevPageLabel;
	}

	public void setPrevPageLabel(final String prevPageLabel) {
		this.prevPageLabel = prevPageLabel;
	}

	public String getNextPageLabel() {
		return nextPageLabel;
	}

	public void setNextPageLabel(final String nextPageLabel) {
		this.nextPageLabel = nextPageLabel;
	}

}
