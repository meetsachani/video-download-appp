package o;

import android.content.ContentResolver;
import android.provider.Settings;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ea  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6085ea {
    public float a(@InterfaceC5670cr1 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
