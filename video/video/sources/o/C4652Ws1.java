package o;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: o.Ws1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4652Ws1 {

    /* renamed from: o.Ws1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static <T, V> ObjectAnimator a(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }

    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return a.a(t, property, path);
    }
}
