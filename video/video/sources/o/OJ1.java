package o;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes.dex */
public class OJ1 {

    /* loaded from: classes.dex */
    public static class a {
        public static <V> PropertyValuesHolder a(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return a.a(property, path);
    }
}
