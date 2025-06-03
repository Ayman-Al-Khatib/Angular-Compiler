import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string = 'My Angular App';

  constructor() {}

  greetUser(name: string): string {
    return `Hello, ${name}! Welcome to ${this.title}`;
  }
}
