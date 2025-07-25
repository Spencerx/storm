/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.22.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.22.0)")
public class GetInfoOptions implements org.apache.storm.thrift.TBase<GetInfoOptions, GetInfoOptions._Fields>, java.io.Serializable, Cloneable, Comparable<GetInfoOptions> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("GetInfoOptions");

  private static final org.apache.storm.thrift.protocol.TField NUM_ERR_CHOICE_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("num_err_choice", org.apache.storm.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetInfoOptionsStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetInfoOptionsTupleSchemeFactory();

  private @org.apache.storm.thrift.annotation.Nullable NumErrorsChoice num_err_choice; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    /**
     * 
     * @see NumErrorsChoice
     */
    NUM_ERR_CHOICE((short)1, "num_err_choice");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUM_ERR_CHOICE
          return NUM_ERR_CHOICE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields[] optionals = {_Fields.NUM_ERR_CHOICE};
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_ERR_CHOICE, new org.apache.storm.thrift.meta_data.FieldMetaData("num_err_choice", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.EnumMetaData(org.apache.storm.thrift.protocol.TType.ENUM, NumErrorsChoice.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetInfoOptions.class, metaDataMap);
  }

  public GetInfoOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetInfoOptions(GetInfoOptions other) {
    if (other.is_set_num_err_choice()) {
      this.num_err_choice = other.num_err_choice;
    }
  }

  @Override
  public GetInfoOptions deepCopy() {
    return new GetInfoOptions(this);
  }

  @Override
  public void clear() {
    this.num_err_choice = null;
  }

  /**
   * 
   * @see NumErrorsChoice
   */
  @org.apache.storm.thrift.annotation.Nullable
  public NumErrorsChoice get_num_err_choice() {
    return this.num_err_choice;
  }

  /**
   * 
   * @see NumErrorsChoice
   */
  public void set_num_err_choice(@org.apache.storm.thrift.annotation.Nullable NumErrorsChoice num_err_choice) {
    this.num_err_choice = num_err_choice;
  }

  public void unset_num_err_choice() {
    this.num_err_choice = null;
  }

  /** Returns true if field num_err_choice is set (has been assigned a value) and false otherwise */
  public boolean is_set_num_err_choice() {
    return this.num_err_choice != null;
  }

  public void set_num_err_choice_isSet(boolean value) {
    if (!value) {
      this.num_err_choice = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NUM_ERR_CHOICE:
      if (value == null) {
        unset_num_err_choice();
      } else {
        set_num_err_choice((NumErrorsChoice)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_ERR_CHOICE:
      return get_num_err_choice();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NUM_ERR_CHOICE:
      return is_set_num_err_choice();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetInfoOptions)
      return this.equals((GetInfoOptions)that);
    return false;
  }

  public boolean equals(GetInfoOptions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_num_err_choice = true && this.is_set_num_err_choice();
    boolean that_present_num_err_choice = true && that.is_set_num_err_choice();
    if (this_present_num_err_choice || that_present_num_err_choice) {
      if (!(this_present_num_err_choice && that_present_num_err_choice))
        return false;
      if (!this.num_err_choice.equals(that.num_err_choice))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_num_err_choice()) ? 131071 : 524287);
    if (is_set_num_err_choice())
      hashCode = hashCode * 8191 + num_err_choice.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(GetInfoOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_num_err_choice(), other.is_set_num_err_choice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_err_choice()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.num_err_choice, other.num_err_choice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetInfoOptions(");
    boolean first = true;

    if (is_set_num_err_choice()) {
      sb.append("num_err_choice:");
      if (this.num_err_choice == null) {
        sb.append("null");
      } else {
        sb.append(this.num_err_choice);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetInfoOptionsStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public GetInfoOptionsStandardScheme getScheme() {
      return new GetInfoOptionsStandardScheme();
    }
  }

  private static class GetInfoOptionsStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<GetInfoOptions> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, GetInfoOptions struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_ERR_CHOICE
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.I32) {
              struct.num_err_choice = org.apache.storm.generated.NumErrorsChoice.findByValue(iprot.readI32());
              struct.set_num_err_choice_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, GetInfoOptions struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.num_err_choice != null) {
        if (struct.is_set_num_err_choice()) {
          oprot.writeFieldBegin(NUM_ERR_CHOICE_FIELD_DESC);
          oprot.writeI32(struct.num_err_choice.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetInfoOptionsTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public GetInfoOptionsTupleScheme getScheme() {
      return new GetInfoOptionsTupleScheme();
    }
  }

  private static class GetInfoOptionsTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<GetInfoOptions> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, GetInfoOptions struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_num_err_choice()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_num_err_choice()) {
        oprot.writeI32(struct.num_err_choice.getValue());
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, GetInfoOptions struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.num_err_choice = org.apache.storm.generated.NumErrorsChoice.findByValue(iprot.readI32());
        struct.set_num_err_choice_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

