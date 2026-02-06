package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {
    public final List<Component<?>> X;

    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.X = list;
    }

    public List<Component<?>> a() {
        return this.X;
    }
}
