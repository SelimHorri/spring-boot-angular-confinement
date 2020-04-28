import { Component, OnInit } from '@angular/core';

@Component({
selector: 'app-list-persons',
templateUrl: './list-persons.component.html',
styleUrls: ['./list-persons.component.css']
})
export class ListPersonsComponent implements OnInit {
	
	persons = [
	{id: '1', fname: 'selim', lname: 'horri', email: '@hotmail', password: '123'},
	{id: '2', fname: 'omar', lname: 'derouiche', email: '@gmail', password: '456'},
	{id: '3', fname: 'amine', lname: 'ladjimi', email: '@yahoo', password: '789'}
	]; 
	
	constructor() {
		
	}
	
	ngOnInit(): void {
		
	}
	
}







