package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import o.OL1;

/* renamed from: o.Ub  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC4388Ub implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* renamed from: a */
    public void readProperties(C4485Vb c4485Vb, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, c4485Vb.getBackgroundTintList());
            propertyReader.readObject(this.c, c4485Vb.getBackgroundTintMode());
            propertyReader.readObject(this.d, c4485Vb.getButtonTintList());
            propertyReader.readObject(this.e, c4485Vb.getButtonTintMode());
            propertyReader.readObject(this.f, c4485Vb.getCompoundDrawableTintList());
            propertyReader.readObject(this.g, c4485Vb.getCompoundDrawableTintMode());
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
