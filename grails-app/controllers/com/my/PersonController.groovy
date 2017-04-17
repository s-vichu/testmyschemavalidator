package com.my

class PersonController {

	static allowedMethods = [create:"POST", delete: "POST", list: "GET", update:"POST"]
    static responseFormats = [
        create: ['json'],
        delete: ['json'],
        list: ['json'],
        update:['json']
    ]	

    def index() { }

    def list() {
    	def result = [:]

    	result.data = Person.findAll()

    	response.status = 200

    	result.status = true
    	result.message = ""

    	respond result
    }

    def create() {
        def result = [:]
        result.status = true
        result.message = ""
        
        
		response.status = 200
		result.data = request.JSON
		respond result
        return true
    }    
}
