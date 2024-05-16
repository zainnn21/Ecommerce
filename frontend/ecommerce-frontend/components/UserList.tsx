import {FC} from 'react';
import {User} from '../types';

interface UserListProps {
    users: User[];
}

const UserList: FC<UserListProps> = ({users}) => {
    return (
        <div>
            <h2>User List</h2>
            <ul>
                {users.map((user) => (
                    <li> key={user.id}{'>'}
                        {user.name} - {user.email}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default UserList;