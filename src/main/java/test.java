import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing下拉列表组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/1
 * Time(创建时间)： 16:23
 * Version(版本): 1.0
 * Description(描述)： Swing JComboBox：下拉列表组件
 * 下拉列表的特点是将多个选项折叠在一起，只显示最前面的或被选中的一个。
 * 下拉列表由 JComboBox 类实现，常用构造方法如下。
 * JComboBox()：创建一个空的 JComboBox 对象。
 * JComboBox(ComboBoxModel aModel)：创建一个 JComboBox，其选项取自现有的 ComboBoxModel。
 * JComboBox(Object[] items)：创建包含指定数组中元素的 JComboBox。
 * JComboBox类的常用方法
 * 方法名称	说明
 * void addItem(Object anObject)	将指定的对象作为选项添加到下拉列表框中
 * void insertItemAt(Object anObject,int index)	在下拉列表框中的指定索引处插入项
 * void removeltem(0bject anObject)	在下拉列表框中删除指定的对象项
 * void removeItemAt(int anlndex)	在下拉列表框中删除指定位置的对象项
 * void removeAllItems()	从下拉列表框中删除所有项
 * int getItemCount()	返回下拉列表框中的项数
 * Object getItemAt(int index)	获取指定索引的列表项，索引从 0 开始
 * int getSelectedIndex()	获取当前选择的索引
 * Object getSelectedltem()	获取当前选择的项
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        jFrame.setSize(640, 480);
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        Font font = new Font("宋体", Font.BOLD, 18);
        JLabel label = new JLabel("请选择你的年龄段：");
        label.setFont(font);
        JComboBox<String> jComboBox = new JComboBox<>();
        jComboBox.setFont(font);
        jComboBox.addItem("0-12");
        jComboBox.addItem("12-18");
        jComboBox.addItem("18-36");
        jComboBox.addItem("36-60");
        jComboBox.addItem("60-80");
        jComboBox.addItem("80-100");
        jComboBox.removeItemAt(1);
        jComboBox.insertItemAt("12-18",1);
        jComboBox.setSelectedIndex(2);
        System.out.println(jComboBox.getItemCount());
        System.out.println(jComboBox.getSelectedIndex());
        System.out.println(jComboBox.getItemAt(2));
        jPanel.add(label);
        jPanel.add(jComboBox);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
