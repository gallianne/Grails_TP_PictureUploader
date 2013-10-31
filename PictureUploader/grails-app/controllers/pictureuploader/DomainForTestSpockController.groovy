package pictureuploader



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DomainForTestSpockController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DomainForTestSpock.list(params), model:[domainForTestSpockInstanceCount: DomainForTestSpock.count()]
    }

    def show(DomainForTestSpock domainForTestSpockInstance) {
        respond domainForTestSpockInstance
    }

    def create() {
        respond new DomainForTestSpock(params)
    }

    @Transactional
    def save(DomainForTestSpock domainForTestSpockInstance) {
        if (domainForTestSpockInstance == null) {
            notFound()
            return
        }

        if (domainForTestSpockInstance.hasErrors()) {
            respond domainForTestSpockInstance.errors, view:'create'
            return
        }

        domainForTestSpockInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'domainForTestSpockInstance.label', default: 'DomainForTestSpock'), domainForTestSpockInstance.id])
                redirect domainForTestSpockInstance
            }
            '*' { respond domainForTestSpockInstance, [status: CREATED] }
        }
    }

    def edit(DomainForTestSpock domainForTestSpockInstance) {
        respond domainForTestSpockInstance
    }

    @Transactional
    def update(DomainForTestSpock domainForTestSpockInstance) {
        if (domainForTestSpockInstance == null) {
            notFound()
            return
        }

        if (domainForTestSpockInstance.hasErrors()) {
            respond domainForTestSpockInstance.errors, view:'edit'
            return
        }

        domainForTestSpockInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DomainForTestSpock.label', default: 'DomainForTestSpock'), domainForTestSpockInstance.id])
                redirect domainForTestSpockInstance
            }
            '*'{ respond domainForTestSpockInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DomainForTestSpock domainForTestSpockInstance) {

        if (domainForTestSpockInstance == null) {
            notFound()
            return
        }

        domainForTestSpockInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DomainForTestSpock.label', default: 'DomainForTestSpock'), domainForTestSpockInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'domainForTestSpockInstance.label', default: 'DomainForTestSpock'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
