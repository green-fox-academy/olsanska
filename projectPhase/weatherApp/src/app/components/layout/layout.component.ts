import { Component, OnInit, Input } from '@angular/core';
import { ForecastComponent } from '../forecast/forecast.component';
import { Weather } from 'src/app/models/weather';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.css']
})
export class LayoutComponent implements OnInit {

  weathers: Weather[];

  constructor() { }

  ngOnInit() {
    this.weathers = [
      {id: 1,
      city: 'wherever1',
      state: 'whereverState1',
      temperature: 1},
      
      {id: 2,
      city: "wherever2",
      state: "whereverState2",
      temperature: 2},

      {id: 3,
      city: "wherever3",
      state: "whereverState3",
      temperature: 3}
    ]
  }

}
