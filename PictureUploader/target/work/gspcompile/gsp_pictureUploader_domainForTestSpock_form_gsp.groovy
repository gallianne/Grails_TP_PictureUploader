import pictureuploader.DomainForTestSpock
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pictureUploader_domainForTestSpock_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/domainForTestSpock/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: domainForTestSpockInstance, field: 'age', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("domainForTestSpock.age.label"),'default':("Age")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("age"),'type':("number"),'value':(domainForTestSpockInstance.age),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: domainForTestSpockInstance, field: 'nom', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("domainForTestSpock.nom.label"),'default':("Nom")],-1)
printHtmlPart(5)
invokeTag('textField','g',18,['name':("nom"),'value':(domainForTestSpockInstance?.nom)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: domainForTestSpockInstance, field: 'prenom', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("domainForTestSpock.prenom.label"),'default':("Prenom")],-1)
printHtmlPart(5)
invokeTag('textField','g',26,['name':("prenom"),'value':(domainForTestSpockInstance?.prenom)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1383215526997L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
