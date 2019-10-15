import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'dateFormat'
})
export class DateFormatPipe implements PipeTransform {
    transform(value: any, args: any[]): any {
        let d = new Date();
        let dt = d.getFullYear() + "-" + (d.getMonth() + 1) + "-"
            + d.getDate() + " " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();

        if (args && args[0] === 'local') {
            return dt;
        } else if (value) {
            return new Date(value);
        }
        return value;
    }
}
