package com.aynurbalikci.NewsApplication;

import java.util.List;

/**
 * Created by Hafta_Sonu on 2.07.2017.
 */

public interface NewsResultListener {
    void onSuccess(List<News> news);
    void onFail(String errorMessage);
}
