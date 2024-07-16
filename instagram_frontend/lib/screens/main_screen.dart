import 'package:flutter/material.dart';
import 'package:instagram_frontend/screens/add_new_post_screen.dart';
import 'package:instagram_frontend/screens/explore_screen.dart';
import 'package:instagram_frontend/screens/home_screen.dart';
import 'package:instagram_frontend/screens/profile_screen.dart';
import 'package:instagram_frontend/screens/reels_screen.dart';
import 'package:instagram_frontend/widgets/custom_bottom_navigation_bar.dart';

class MainScreen extends StatefulWidget {
  const MainScreen({super.key});

  @override
  _MainScreenState createState() => _MainScreenState();
}

class _MainScreenState extends State<MainScreen> {
  int _currentIndex = 0;

  final List<Widget> _screens = [
    const HomeScreen(),
    const ExploreScreen(),
    const AddNewPostScreen(),
    const ReelsScreen(),
    const ProfileScreen(),
  ];

  void _onTabTapped(int index) {
    setState(() {
      _currentIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: _screens[_currentIndex],
        bottomNavigationBar: CustomBottomNavigationBar(
          currentIndex: _currentIndex,
          onTap: _onTabTapped,
        ));
  }
}
