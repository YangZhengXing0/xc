package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Category;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 208/2/7.
 */
@Data
public class CategoryNode extends Category {

    List<CategoryNode> children;

}
