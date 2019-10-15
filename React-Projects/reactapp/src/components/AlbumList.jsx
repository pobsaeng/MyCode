import React from 'react';
import Album from './Album';
const AlbumList = (props) => {
    const albums = props.albums.map((album) => <li>{album.name}</li>);

    return (
        <ul>
            {albums}
        </ul>
    );
};

AlbumList.propTypes = {
    albums: React.PropTypes.array.isRequired,
};

export default AlbumList;
