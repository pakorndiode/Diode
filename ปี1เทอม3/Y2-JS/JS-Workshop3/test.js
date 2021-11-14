const getUser = async () =>{
    try {
        const respone = await axios.get(
            'https://6102d7aa79ed680017482359.mockapi.io/productlist'
        )
        document.getElementById('test1').innerHTML = respone.data.map(
            (product) =>
            `
            <div class="col-md-4">
            <img src="${product.prdImageUrl}">
            <div>Product Name: ${product.prdname} </div>
            <div>Price : ${product.prdPrice}</div>
            <button onclick="lacation.href = 'index2.html?id=${product.id}'">ADD</button>
            </div>
            `
        ).join('')
    } catch (error) {
        console.log('e',error)
    }
}
getUser();