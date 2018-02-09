import React, {Component} from 'react';
import {ToastAndroid} from 'react-native';
/**
 * Desc:Toast工具类
 */
export default class ToastUtil {

    static show(hint) {
        ToastAndroid.show(hint, ToastAndroid.SHORT);
    }

}