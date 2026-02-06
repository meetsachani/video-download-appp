package o;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class XC1 {
    public final boolean a;
    public Configuration b;

    public XC1(boolean z) {
        this.a = z;
    }

    public final Configuration a() {
        Configuration configuration = this.b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean b() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XC1(boolean z, Configuration configuration) {
        this(z);
        C6562gT0.p(configuration, "newConfig");
        this.b = configuration;
    }
}
