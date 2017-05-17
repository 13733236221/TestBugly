package com.zhike.testbugly;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by root on 17-5-17.
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication(){
        super(ShareConstants.TINKER_ENABLE_ALL, "com.zhike.testbugly.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
