Wiidget is a language that is engineered to be flexible for build UI in first line but be capable describe any structured document or execution.
Basically wiidget is just a language with ability of describing parent - childern relations. But it can do with logic. As it will be shown above entries can lin each other, call each other and modify global context.

# What is a wiidget document? #

Wiidget document is a well defined and structured. It has two parts. Both are optional but the order is strict.

## Import section ##
In this section we can define the wiidgets what we will use in the current document. The statements are similar to Java syntax expect some thing:

 * import is not allowed for packages. So there is no joker import. (.*)
 * imported wiidget can have alias. If an alias is defined for the wiidget we can refer it with the alias
 * import can an URI string. In this case the specified protocol handler will load the wiidget

Sample:

    import path.to.package.of.WiidgetClass;
	import path.to.otherpackage.of.WiidgetClass as OtherWiidget;
	import path.to.wiidget.file;
	import "http://www.wiidgetrepo.org/other-company/BestWiidget" as OthersBest // alias here is mandatory

 * first import is a simple Java class that extends the Wiidget abstract class
 * second is an other wiidget with same name as first. But it has an alias to avoid name conflict
 * third imports an wiidget file. Rendering of this will be disclaimed later
 * fourth is an URI import. This can load any inner or external resource as wiidget. Alias here is mandatory because parser cannot decide about the name of the wiidget from URI in every case



