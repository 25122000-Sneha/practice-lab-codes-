let validate = () => {
    let name = document.getElementById("name").value;
    let email  = document.getElementById("email").value;
    
    if(name.length === 0)
    {
        document.getElementById("validateError").innerHTML = "Invalid Information";
        return false;
    }
    else if(email.test(/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/) === false)
    {
        document.getElementById("validateError").innerHTML = "Invalid Information";
        return false;
    }else{
        return true;
    }
    
    
  }
  