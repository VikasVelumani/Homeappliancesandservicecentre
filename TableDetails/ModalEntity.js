import axios from 'axios';

const get_customer_url = "http://localhost:8080/get"
const update_customer_url = "http://localhost:8080/put"

class ModalEntity{
    
    getCustomers(){
        return axios.get(get_customer_url);
    }
    updateCustomers(){
        return axios.put(update_customer_url);
    }
}

// eslint-disable-next-line import/no-anonymous-default-export
export default  new ModalEntity();