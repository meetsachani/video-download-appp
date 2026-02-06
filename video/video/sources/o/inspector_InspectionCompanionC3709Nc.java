package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import o.OL1;

/* renamed from: o.Nc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC3709Nc implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;

    /* renamed from: a */
    public void readProperties(C3611Mc c3611Mc, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, c3611Mc.getBackgroundTintList());
            propertyReader.readObject(this.c, c3611Mc.getBackgroundTintMode());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapObject;
        int mapObject2;
        mapObject = propertyMapper.mapObject("backgroundTint", OL1.b.b0);
        this.b = mapObject;
        mapObject2 = propertyMapper.mapObject("backgroundTintMode", OL1.b.c0);
        this.c = mapObject2;
        this.a = true;
    }
}
