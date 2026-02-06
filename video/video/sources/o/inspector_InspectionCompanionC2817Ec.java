package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import o.OL1;

/* renamed from: o.Ec  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC2817Ec implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* renamed from: a */
    public void readProperties(C2926Fc c2926Fc, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, c2926Fc.getBackgroundTintList());
            propertyReader.readObject(this.c, c2926Fc.getBackgroundTintMode());
            propertyReader.readObject(this.d, c2926Fc.getButtonTintList());
            propertyReader.readObject(this.e, c2926Fc.getButtonTintMode());
            propertyReader.readObject(this.f, c2926Fc.getCompoundDrawableTintList());
            propertyReader.readObject(this.g, c2926Fc.getCompoundDrawableTintMode());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapObject;
        int mapObject2;
        int mapObject3;
        int mapObject4;
        int mapObject5;
        int mapObject6;
        mapObject = propertyMapper.mapObject("backgroundTint", OL1.b.b0);
        this.b = mapObject;
        mapObject2 = propertyMapper.mapObject("backgroundTintMode", OL1.b.c0);
        this.c = mapObject2;
        mapObject3 = propertyMapper.mapObject("buttonTint", OL1.b.q0);
        this.d = mapObject3;
        mapObject4 = propertyMapper.mapObject("buttonTintMode", OL1.b.r0);
        this.e = mapObject4;
        mapObject5 = propertyMapper.mapObject("drawableTint", OL1.b.l1);
        this.f = mapObject5;
        mapObject6 = propertyMapper.mapObject("drawableTintMode", OL1.b.m1);
        this.g = mapObject6;
        this.a = true;
    }
}
