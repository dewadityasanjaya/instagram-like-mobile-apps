import 'package:flutter/material.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text(
          'Instagram',
          style: TextStyle(
            fontFamily: 'Billabong',
            fontSize: 32.0,
          ),
        ),
        actions: [
          IconButton(
            icon: const Icon(Icons.favorite_border),
            onPressed: () {
              // Add new post functionality
            },
          ),
          IconButton(
            icon: const Icon(Icons.send),
            onPressed: () {
              // Open messages functionality
            },
          ),
        ],
        backgroundColor: Colors.white,
        elevation: 1.0,
      ),
      body: SingleChildScrollView(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            _buildStoriesSection(),
            const Divider(height: 1.0, color: Colors.grey),
            _buildPostsSection(),
          ],
        ),
      ),
    );
  }

  Widget _buildStoriesSection() {
    return SizedBox(
      height: 100.0,
      child: ListView(
        scrollDirection: Axis.horizontal,
        children: List.generate(10, (index) {
          return Container(
            width: 80.0,
            padding: const EdgeInsets.all(8.0),
            child: Column(
              children: [
                const CircleAvatar(
                  radius: 30.0,
                  backgroundImage:
                      NetworkImage('https://via.placeholder.com/150'),
                ),
                const SizedBox(height: 5.0),
                Text('User $index', style: const TextStyle(fontSize: 12.0)),
              ],
            ),
          );
        }),
      ),
    );
  }

  Widget _buildPostsSection() {
    return Column(
      children: List.generate(10, (index) {
        return _buildPostItem(index);
      }),
    );
  }

  Widget _buildPostItem(int index) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: [
        ListTile(
          leading: const CircleAvatar(
            backgroundImage: NetworkImage('https://via.placeholder.com/150'),
          ),
          title: Text('User $index'),
          subtitle: Text('Location $index'),
          trailing: const Icon(Icons.more_vert),
        ),
        Container(
          height: 300.0,
          color: Colors.grey[300],
          child: Image.network(
            'https://via.placeholder.com/600',
            fit: BoxFit.cover,
          ),
        ),
        const Padding(
          padding: EdgeInsets.all(8.0),
          child: Row(
            children: [
              Icon(Icons.favorite_border),
              SizedBox(width: 16.0),
              Icon(Icons.chat_bubble_outline),
              SizedBox(width: 16.0),
              Icon(Icons.send),
            ],
          ),
        ),
        const Padding(
          padding: EdgeInsets.symmetric(horizontal: 8.0),
          child: Text('Liked by user123 and others'),
        ),
        Padding(
          padding: const EdgeInsets.all(8.0),
          child: RichText(
            text: TextSpan(
              children: [
                TextSpan(
                  text: 'User $index ',
                  style: const TextStyle(
                      fontWeight: FontWeight.bold, color: Colors.black),
                ),
                TextSpan(
                  text: 'This is a sample caption for post $index',
                  style: const TextStyle(color: Colors.black),
                ),
              ],
            ),
          ),
        ),
        const Padding(
          padding: EdgeInsets.symmetric(horizontal: 8.0),
          child:
              Text('View all comments', style: TextStyle(color: Colors.grey)),
        ),
        const Padding(
          padding: EdgeInsets.all(8.0),
          child: Text('1 hour ago',
              style: TextStyle(color: Colors.grey, fontSize: 12.0)),
        ),
        const Divider(height: 1.0, color: Colors.grey),
      ],
    );
  }
}
