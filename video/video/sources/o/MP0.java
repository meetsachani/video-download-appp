package o;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public interface MP0<T> {
    T create(Context context);

    List<Class<? extends MP0<?>>> dependencies();
}
