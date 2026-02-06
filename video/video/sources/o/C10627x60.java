package o;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* renamed from: o.x60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10627x60 {
    public final DragAndDropPermissions a;

    /* renamed from: o.x60$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        public static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public C10627x60(DragAndDropPermissions dragAndDropPermissions) {
        this.a = dragAndDropPermissions;
    }

    public static C10627x60 b(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions b = a.b(activity, dragEvent);
        if (b != null) {
            return new C10627x60(b);
        }
        return null;
    }

    public void a() {
        a.a(this.a);
    }
}
