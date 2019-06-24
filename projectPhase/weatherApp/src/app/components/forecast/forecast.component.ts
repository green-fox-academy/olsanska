import { Component, OnInit, Input } from '@angular/core';
import { Weather } from 'src/app/models/weather';

@Component({
  selector: 'app-forecast',
  templateUrl: './forecast.component.html',
  styleUrls: ['./forecast.component.css']
})
export class ForecastComponent implements OnInit {

  @Input() weather: Weather;

  constructor() { }

  ngOnInit() {
  }

}
