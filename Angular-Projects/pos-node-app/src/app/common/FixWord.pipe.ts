import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'FixWordPipe' })

export class FixWordPipe implements PipeTransform {

    transform(value: any, args?: any): any {
        if (args === undefined) return value;

        if (value.length > args) {
            return value.substring(0, args) + '...';

        } else {
            return value;
        }
    }

}
