package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;

/* renamed from: o.Do2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2770Do2 {
    public static c a;

    /* renamed from: o.Do2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* renamed from: o.Do2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    /* renamed from: o.Do2$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(Intent intent);

        void b(PendingIntent pendingIntent);
    }

    public static void a() {
        a = null;
    }

    public static void b(c cVar) {
        a = cVar;
    }

    public static void c(TileService tileService, C8942qC1 c8942qC1) {
        if (Build.VERSION.SDK_INT >= 34) {
            c cVar = a;
            if (cVar != null) {
                cVar.b(c8942qC1.f());
                return;
            } else {
                b.a(tileService, c8942qC1.f());
                return;
            }
        }
        c cVar2 = a;
        if (cVar2 != null) {
            cVar2.a(c8942qC1.d());
        } else {
            a.a(tileService, c8942qC1.d());
        }
    }
}
