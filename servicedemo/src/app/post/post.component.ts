import { Component, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { PostService } from '../services/post.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css'],
  
})
export class PostComponent implements OnInit{
  posts: Array<any>;

  constructor(private postService: PostService){
    this.posts = postService.postList;
    //this.addNewData();
  }
  ngOnInit(): void {
    
  }

  addNewData(){
    let newPost: Post = {
      id: 7,
      postTitle: "Post 7"
    }

    this.postService.addPost(newPost);
  }
}
