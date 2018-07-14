import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatCardModule, MatListModule, MatButtonModule, MatFormFieldModule, MatIconModule, MAT_DATE_LOCALE} from '@angular/material';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatInputModule} from '@angular/material/input';
import {MatDatepickerModule} from '@angular/material/datepicker';


@NgModule({

  imports: [MatCardModule, MatListModule,
    MatButtonModule, MatExpansionModule, MatFormFieldModule,
    MatIconModule, MatInputModule, MatDatepickerModule],

  exports: [MatCardModule, MatListModule,
    MatButtonModule, MatExpansionModule, MatFormFieldModule,
    MatIconModule, MatInputModule, MatDatepickerModule],
 
})

export class MaterialModule {}

