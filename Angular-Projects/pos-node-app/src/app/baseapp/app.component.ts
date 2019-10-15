import { Component } from '@angular/core';
import { AuthGuard } from './auth-guard.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(public auth: AuthGuard) {
  }
  
  ngOnInit() { }
}
