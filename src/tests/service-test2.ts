import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private users: string[] = [];

  constructor() {}

  addUser(user: string): void {
    this.users.push(user);
  }

  getUsers(): string[] {
    return this.users;
  }
}
