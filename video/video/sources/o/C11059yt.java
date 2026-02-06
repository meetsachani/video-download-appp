package o;

import java.util.Calendar;
import java.util.Objects;

/* renamed from: o.yt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11059yt {
    public static final C11059yt b = new C11059yt(Calendar.getInstance());
    public final Calendar a;

    public C11059yt(Calendar calendar) {
        Objects.requireNonNull(calendar, "calendar");
        this.a = calendar;
    }

    public int a() {
        return this.a.get(5);
    }

    public int b() {
        return this.a.get(2);
    }

    public int c() {
        return this.a.get(1);
    }
}
