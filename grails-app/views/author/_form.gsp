<%@ page import="grails2.heroku.Author" %>



<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="author.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${authorInstance?.name}"/>
</div>

