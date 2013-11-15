<%@ page import="pictureuploader.DomainForTestSpock" %>



<div class="fieldcontain ${hasErrors(bean: domainForTestSpockInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="domainForTestSpock.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${domainForTestSpockInstance.age}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: domainForTestSpockInstance, field: 'image', 'error')} ">
	<label for="image">
		<g:message code="domainForTestSpock.image.label" default="Image" />
		
	</label>
	<g:textField name="image" value="${domainForTestSpockInstance?.image}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: domainForTestSpockInstance, field: 'nom', 'error')} ">
	<label for="nom">
		<g:message code="domainForTestSpock.nom.label" default="Nom" />
		
	</label>
	<g:textField name="nom" value="${domainForTestSpockInstance?.nom}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: domainForTestSpockInstance, field: 'prenom', 'error')} ">
	<label for="prenom">
		<g:message code="domainForTestSpock.prenom.label" default="Prenom" />
		
	</label>
	<g:textField name="prenom" value="${domainForTestSpockInstance?.prenom}"/>
</div>

