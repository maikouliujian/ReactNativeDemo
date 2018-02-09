/**
 * Function:屏幕尺寸辅助类
 * Desc:
 */
import {Dimensions} from 'react-native';

export default class DimenUtil  {

    static getScreenWidth(){
        return Dimensions.get('window').width;
    }

}