import {FC} from "react";
import {GetServerSideProps} from "next";
import {User} from "@/types";
import UserList from "@/components/UserList";

interface UserListPageProps {
    users: User[];
}

const UserListPage: FC<UserListPageProps> = ({users}) => {
    return (
        <div>
            <h1>User Page</h1>
            <UserList users={users} />
        </div>
    );
};

export const getServerSideProps: GetServerSideProps = async () => {
    const response = await fetch('http://localhost:3000/api/users');
    const users = await response.json();
    return {
        props: {
            users,
        },
    };
};

export default UserListPage;