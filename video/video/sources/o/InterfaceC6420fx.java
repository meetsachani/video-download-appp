package o;

import android.util.Range;
import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* renamed from: o.fx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6420fx {
    public static final float a = 1.0f;
    public static final String b = "<unknown>";
    public static final String c = "androidx.camera.camera2";
    public static final String d = "androidx.camera.camera2.legacy";
    public static final String e = "androidx.camera.fake";

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.fx$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    C2898Ex b();

    LiveData<AbstractC3007Fx> e();

    int f();

    default int g() {
        return -1;
    }

    default boolean h(C2602Bw0 c2602Bw0) {
        return false;
    }

    default Set<Range<Integer>> i() {
        return Collections.EMPTY_SET;
    }

    boolean l();

    LiveData<Integer> o();

    default boolean p() {
        return false;
    }

    InterfaceC9802tj0 q();

    String s();

    int t(int i);

    default boolean u() {
        return false;
    }

    LiveData<InterfaceC9483sO2> x();

    default float y() {
        return 1.0f;
    }
}
