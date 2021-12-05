import axios from 'axios';

const ACCOUNT_API_BASE_URL = "http://localhost:8080/api/v1/login";

class NewAccount {
    
    createAccount(account){
        return axios.post(ACCOUNT_API_BASE_URL, account);
    }
}

export default new NewAccount()