package org.landa.wiidget.library.html.datatable;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.html.TemplatedHtmlWiidget;
import org.landa.wiidget.validator.Required;

public class LinkPaginator extends TemplatedHtmlWiidget implements Paginator {

	@Required
	@DefaultField
	private PageableDataTable dataTable;

	private String cssClass = "pagination";

	@Required
	private String pageVar = "page";

	private String listCssClass = "paginator-list";

	private String prevPageLabel = "&laquo;";

	private String nextPageLabel = "&raquo;";

	@Required
	private int itemsPerPage = 5;

	public PageableDataTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(final PageableDataTable dataTable) {
		this.dataTable = dataTable;
	}

	@Override
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
	public int getPageCount() {
		final int listSize = getDataTable().getDataSize();

		return (int) Math.ceil(listSize / getItemsPerPage());
	}

	public void setPageVar(final String pageVar) {
		this.pageVar = pageVar;
	}

	public String getClientPageVar() {
		final String tableId = getDataTable().getId();
		return tableId + "." + getPageVar();
	}

	public String getPageVar() {
		return pageVar;
	}

	public int getItemsPerPage() {
		return getDataTable().getPageable().getPageSize();
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
