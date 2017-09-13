//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity-line.component.ts.e.vm
//
import {Component, Input} from '@angular/core';
import {InvGstr1} from './invGstr1';

@Component({
	template: `
        {{ invGstr1?.gstin }} {{ invGstr1?.state }} {{ invGstr1?.flag }} 	`,
	selector: 'invGstr1-line',
})
export class InvGstr1LineComponent {
    @Input() invGstr1 : InvGstr1;
}
