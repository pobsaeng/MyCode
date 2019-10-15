var webpack = require('webpack');

module.exports = {

    entry: './src',
    devServer: {
        inline: true,
        contentBase: './src',
        port: 3000
    },
    module: {
        loaders: [
            {
                test: /\.js$/,
                exclude: /(node_modules)/,
                loader: 'babel',
                query: {
                    presets: ['react', 'es2015']
                }
            },
            {
                test: /\.scss/,
                loader: 'style-loader!css-loader!sass-loader'
            }
        ]
    },
    devtool: 'cheap-module-eval-source-map',
    output: {
        path: 'src',
        filename: 'bundle.js'
    }
};
