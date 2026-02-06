package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import o.OL1;

/* renamed from: o.wc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC10505wc implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;

    /* renamed from: a */
    public void readProperties(C10748xc c10748xc, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, c10748xc.getBackgroundTintList());
            propertyReader.readObject(this.c, c10748xc.getBackgroundTintMode());
            propertyReader.readObject(this.d, c10748xc.getImageTintList());
            propertyReader.readObject(this.e, c10748xc.getImageTintMode());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapObject;
        int mapObject2;
        int mapObject3;
        int mapObject4;
        mapObject = propertyMapper.mapObject("backgroundTint", OL1.b.b0);
        this.b = mapObject;
        mapObject2 = propertyMapper.mapObject("backgroundTintMode", OL1.b.c0);
        this.c = mapObject2;
        mapObject3 = propertyMapper.mapObject("tint", OL1.b.H3);
        this.d = mapObject3;
        mapObject4 = propertyMapper.mapObject("tintMode", OL1.b.I3);
        this.e = mapObject4;
        this.a = true;
    }
}
