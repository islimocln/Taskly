// TasklyMobile/screens/OnboardingScreen.tsx

import React from 'react';
import { View, Text, Button, Image, StyleSheet, ScrollView } from 'react-native';

const OnboardingScreen = ({ navigation }: any) => {
  return (
    <ScrollView contentContainerStyle={styles.container}>
      {/* Görsel veya İçerik */}
      <View style={styles.imageContainer}>
        <Image 
          source={require('../assets/trello_example_image.png')} // Trello gibi bir görsel ekleyebilirsiniz
          style={styles.image}
        />
      </View>

      <Text style={styles.title}>Taskly ile Görevlerinizi Yönetmeye Başlayın</Text>
      <Text style={styles.description}>
        Taskly, görevlerinizi kolayca organize etmenizi sağlayan güçlü bir platformdur. 
        Web ve mobil cihazlarınızda istediğiniz her yerde çalışabilirsiniz.
      </Text>

      {/* Kayıt Ol Butonu */}
      <Button 
        title="Kayıt Ol" 
        onPress={() => navigation.navigate('SignUp')} // Sign Up sayfasına yönlendirir
      />
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    flexGrow: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#f2f2f2',
    padding: 20,
  },
  imageContainer: {
    marginBottom: 40,
  },
  image: {
    width: 250,
    height: 250,
    resizeMode: 'contain',
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

export default OnboardingScreen;
