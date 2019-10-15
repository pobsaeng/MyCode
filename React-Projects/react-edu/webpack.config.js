var path = require('path');
var webpack = require('webpack');

module.exports = {
    entry: './main.js',
    // output: {  path:__dirname, filename: './dist/bundle.js' },
    output: { path: __dirname, filename: 'bundle.js' },
    
    devServer: {
        inline: true,
        port: 8080
    },

    module: {
        loaders: [
            {
                // Only run `.js` and `.jsx` files through Babel
                test: /\.jsx?$/,
                loader: 'babel-loader',
                exclude: /node_modules/,
                query: {
                    presets: ['es2015', 'react'],
                }
            }
        ]
    }
};