import React, { Component } from 'react';
//import EmployeeService from '../services/EmployeeService';

class ConnectionComponent extends Component {
    
    constructor(props) {
        super(props)

        this.state = {

            customer:[]
            /*id: this.props.match.params.id,
            customerID:'',
            initialCredit:'',*/
        } //these props will help us to get the form data and this data will be available in a form submission

       /* this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this);
        this.changeLastNameHandler = this.changeLastNameHandler.bind(this);
        this.saveOrUpdateEmployee = this.saveOrUpdateEmployee.bind(this);*/

    }
/*
    componentDidMount(){

        if(this.state.id === '_add'){ //===means is two strings are equal or not
            return
        } else {
            //id's are always positive
            EmployeeService.getEmployeeById(this.state.id).then((res) => {
                let employee = res.data;
                this.setState({firstName: employee.firstName, lastName: employee.lastName, emailId: employee.emailId})
            });
        }
    }

    saveOrUpdateEmployee = (event)=> {
        event.preventDefault();
        let employee = {firstName: this.state.firstName, lastName: this.state.lastName, emailId: this.state.emailId};
        console.log('employee => ' + JSON.stringify(employee));

        if(this.state.id === '_add'){
            EmployeeService.createEmployee(employee).then(res =>{
                this.props.history.push('/employees');//go back to employees page
            });
        } else {
            EmployeeService.updateEmployee(employee, this.state.id).then(res => { //axios method returns a promise
                this.props.history.push('/employees');
            });
        }   
    }
    */

    newAccount(){
        this.props.history.push('/new-account/_newAccount'); //whenever we click on add employee then this route will get called
        //router maintains a history object and this history boject has all the mappings of the routings
        //this history object makes us mannually control the history of the browser 
    }

    cancel(){
        this.props.history.push('/login-menu');//navigate to the employee url when cancel button is pressed
    }

    changeFirstNameHandler=(event) => {
        this.setState({firstName: event.target.value}); //assign to firstName after the event handler has been triggered
    }

    changeLastNameHandler=(event) => {
        this.setState({lastName: event.target.value}); //assign to lastName after the event handler has been triggered
    }

    changeEmailHandler=(event) => {
        this.setState({emailId: event.target.value}); //assign to lastName after the event handler has been triggered
    }

    
    
    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className = "text-center"> Add Employee </h3>
        }else {
            return <h3 className = "text-center"> Login </h3>
        }
    }

    render() {
        return (
            <div>
                <div className = "container">
                    <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset-md-3"> 
                            {
                                this.getTitle()
                            }
                            <div className = "card-body">
                                <form>
                                    <div className = "form-group">
                                        <label> Customer ID : </label>
                                        <input placeholder="Customer ID" name="firstName" className="form-control"
                                            value={this.state.customerID} onChange={this.changeFirstNameHandler}/>
                                    </div>
                                    <div className = "form-group">
                                        <label> Initial Credit : </label>
                                        <input placeholder="Initial Credit" name="lastName" className="form-control"
                                            value={this.state.initialCredit} onChange={this.changeLastNameHandler}/>
                                    </div>

                                    <button className="btn btn-success" onClick={this.saveOrUpdateEmployee}> Login </button>
                                    <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}> Cancel </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default ConnectionComponent;