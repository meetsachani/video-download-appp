package com.facebook.gamingservices;

import android.content.Context;
import android.net.Uri;
import com.facebook.S;
import java.io.FileNotFoundException;
import o.R32;
import o.S32;
import o.TG2;

/* loaded from: classes2.dex */
public class r {
    public Context a;

    public r(Context context) {
        this.a = context;
    }

    public void a(String caption, Uri videoUri) throws FileNotFoundException {
        b(caption, videoUri, null);
    }

    public void b(String caption, Uri videoUri, S.g callback) throws FileNotFoundException {
        c(caption, videoUri, false, callback);
    }

    public void c(String caption, Uri videoUri, boolean shouldLaunchMediaDialog, S.g callback) throws FileNotFoundException {
        S32 build = new S32.a().G(new R32.a().m(videoUri).build()).A(caption).build();
        if (shouldLaunchMediaDialog) {
            callback = new v(this.a, callback);
        }
        TG2.v(build, callback);
    }
}
