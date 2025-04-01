// TasklyMobile/screens/SignUpScreen.tsx

import React from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';

const SignUpScreen = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Kayıt Ol</Text>
      <Text style={styles.description}>Kendi hesabınızı oluşturun ve görevlerinizi yönetin!</Text>

      {/* Kayıt Ol butonu */}
      <Button title="Kayıt Ol" onPress={() => alert('Kayıt Olma işlemi tamamlandı!')} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#f2f2f2',
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 20,
  },
  description: {
    fontSize: 16,
    textAlign: 'center',
    marginBottom: 40,
  },
});

export default SignUpScreen;
