/**
 * Function:为了兼容Android和iOS设置统一程序入口
 * Desc:
 */
import React, {Component} from "react";
import {AppRegistry} from "react-native";
import './utils/StorageUtil';

import HelloWorld from "./00_helloworld_demo/HelloWorld";
import FlexTest from "./01_flex_demo/FlexTest";
import FlexDiceTest from "./01_flex_demo/FlexDiceTest";
import FetchNetData from "./02_fetch_demo/FetchNetData";
import BannerTest from './03_library_demo/BannerTest';
import TopTabViewTest from './03_library_demo/tab_demo/TopTabViewTest';
import BottomTabViewTest from './03_library_demo/tab_demo/BottomTabViewTest'
import TaberTest from './03_library_demo/tab_demo/TaberTest'
import AnatomyTest from './04_nativebase_demo/AnatomyTest';
import ScrollViewTest from './05_scroll_demo/ScrollViewTest'
import ListViewTest from './05_scroll_demo/ListViewTest';
//import ListViewTest1 from './05_scroll_demo/ListViewTest1';
import VideoListItem from './05_scroll_demo/VideoListItem';
import MainPage from './eyepetizer_demo/MainPage';
import StartUp from './eyepetizer_demo/StartUp';
import ParallaxTest from './03_library_demo/ParallaxTest';

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
AppRegistry.registerComponent('FlexTest', ()=>FlexTest);
AppRegistry.registerComponent('FlexDiceTest', () => FlexDiceTest);
AppRegistry.registerComponent('FetchNetData', () => FetchNetData);
AppRegistry.registerComponent('BannerTest', () => BannerTest);
AppRegistry.registerComponent('TopTabViewTest', ()=>TopTabViewTest);
AppRegistry.registerComponent('BottomTabViewTest', ()=>BottomTabViewTest);
AppRegistry.registerComponent('TaberTest', ()=>TaberTest);
AppRegistry.registerComponent('AnatomyTest', ()=>AnatomyTest);
AppRegistry.registerComponent('ScrollViewTest', ()=>ScrollViewTest);
AppRegistry.registerComponent('ListViewTest', ()=>ListViewTest);
//AppRegistry.registerComponent('HelloWorld', ()=>ListViewTest1);
AppRegistry.registerComponent('VideoListItem', ()=>VideoListItem);
AppRegistry.registerComponent('StartUp', ()=>StartUp);
AppRegistry.registerComponent('MainPage', ()=>MainPage);
AppRegistry.registerComponent('ParallaxTest', ()=>ParallaxTest);